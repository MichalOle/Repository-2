package com.secend_Package.inheritance;

    public class Car {
        private int wheels;
        private int seats;
        public Car() {
            System.out.println("Car constructor - default");

        }
        public Car(int wheels,int seats ) {
            System.out.println("Car constructor");
            this.wheels = wheels;
            this.seats = seats;

        }
        public int getWheels() {
            return wheels;
        }

        public void setWheels(int wheels) {
            this.wheels = wheels;
        }

        public int getSeats() {
            return seats;
        }

        public void setSeats(int seats) {
            this.seats = seats;
        }

        public static void turnOnLights() {
            System.out.println("Lights were turned on");
        }
        public void openDoors() {
            System.out.println("Opening 4 doors");
        }
        public void displayNumberOfSeats() {
            System.out.println("Number of seats: " + seats);
        }
}
