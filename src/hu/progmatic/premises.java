package hu.progmatic;

import java.util.Arrays;

public class premises {

        private int price;

        private String name;
        private Tool[] tools;

        public Tool[] getTools() {
            return tools;
        }

        public void setTools(Tool[] tools) {
            this.tools = tools;
        }

    public int getPrice() {
        return price;
    }

    public premises(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public premises(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }


        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "premises{" +
                    "name='" + name + '\'' +
                    ", tools=" + Arrays.toString(tools) +
                    '}';
        }
    }


