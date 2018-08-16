package com.ankit.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Stats {
	
	
	public static class StatisticsAggregatorImpl implements StatisticsAggregator {
		Map<String, Double> symbolPriceMap= new HashMap<String, Double>();
		Map<String, Integer> symbolPriceMapOccurence= new HashMap<String, Integer>();
		
		@Override
		public void putNewPrice(String symbol, double price) {
			int occurence=1;
			if(symbolPriceMap.containsKey(symbol) && symbolPriceMapOccurence.containsKey(symbol) ){
				
				double value = symbolPriceMap.get(symbol);
				 occurence = symbolPriceMapOccurence.get(symbol);
				occurence= occurence+1;
				price=value+price;
				
			}
			symbolPriceMap.put(symbol, price);
			symbolPriceMapOccurence.put(symbol,occurence);
			
		}

		@Override
		public double getAveragePrice(String symbol) {
			
			double value = symbolPriceMap.get(symbol);
			int occurence = symbolPriceMapOccurence.get(symbol);
			
			return value/occurence;
			
		}

		@Override
		public int getTickCount(String symbol) {

			return symbolPriceMapOccurence.get(symbol);

		}
	}

	////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	public interface StatisticsAggregator {
		// This is an input. Make note of this price.
		public void putNewPrice(String symbol, double price);

		// Get the average price
		public double getAveragePrice(String symbol);

		// Get the total number of prices recorded
		public int getTickCount(String symbol);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter details");
		while (scanner.hasNext()) {
			final StatisticsAggregator stats = new StatisticsAggregatorImpl();
			final Set<String> symbols = new TreeSet<>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			int threads = Integer.parseInt(inputs[0]);
			ExecutorService pool = Executors.newFixedThreadPool(threads);
			for (int i = 1; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String symbol = tokens[0];
				symbols.add(symbol);
				final double price = Double.parseDouble(tokens[1]);
				pool.submit(new Runnable() {
					@Override
					public void run() {
						stats.putNewPrice(symbol, price);
					}
				});

			}
			pool.shutdown();
			try {
				pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (String symbol : symbols) {
				System.out.println(String.format("%s %.4f %d", symbol,
						stats.getAveragePrice(symbol),
						stats.getTickCount(symbol)));
			}
		}
		scanner.close();

	}
}