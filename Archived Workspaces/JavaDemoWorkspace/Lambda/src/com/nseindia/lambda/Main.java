package com.nseindia.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 12, 33 };

		ArrayList<Integer> arrList = intToArrayList(arr);

		ExecutorService exec = new ScheduledThreadPoolExecutor(2);

		Runnable r = () -> {
			System.out.println(Arrays.toString(arr));
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};

		Arrays.stream(arr).forEach((n) -> System.out.println(n));

		exec.execute(r);

	}

	public static ArrayList<Integer> intToArrayList(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		return list;
	}

	public static void printSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("The sum is " + sum);
	}

	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void calcSquare(int[] arr){
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i]*arr[i];
		}
	}
	
}
