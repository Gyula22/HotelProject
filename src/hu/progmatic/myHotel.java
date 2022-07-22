package hu.progmatic;

import java.util.Arrays;

public class myHotel {
        private premises[] guestRoom;
        private premises kitchen;
        private premises laundry;
        private premises bathroom;

        public myHotel(premises[] guestRoom, premises kitchen, premises laundry, premises bathroom) {
            this.guestRoom = guestRoom;
            this.kitchen = kitchen;
            this.laundry = laundry;
            this.bathroom = bathroom;
        }

        @Override
        public String toString() {
            return "myHotel{" +
                    "guestRoom=" + Arrays.toString(guestRoom) +
                    ", kitchen=" + kitchen +
                    ", laundry=" + laundry +
                    ", bathroom=" + bathroom +
                    '}';
        }

        public premises[] getGuestRoom() {
            return guestRoom;
        }

        public void setGuestRoom(premises[] guestRoom) {
            this.guestRoom = guestRoom;
        }

        public premises getKitchen() {
            return kitchen;
        }

        public void setKitchen(premises kitchen) {
            this.kitchen = kitchen;
        }

        public premises getLaundry() {
            return laundry;
        }

        public void setLaundry(premises laundry) {
            this.laundry = laundry;
        }

        public premises getBathroom() {
            return bathroom;
        }

        public void setBathroom(premises bathroom) {
            this.bathroom = bathroom;
        }
    }


