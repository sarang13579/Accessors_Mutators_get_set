package com.pluralsight.getset;

public class Main {

    public static void main(String[] args) {
	Flight slcToNyc = new Flight();
	slcToNyc.setSeats(150);
	System.out.println(slcToNyc.getSeats());
    }
}
