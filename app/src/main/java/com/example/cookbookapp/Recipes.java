package com.example.cookbookapp;

public class Recipes {

        private String user;    //user who post the recipe
        private String food_picture; //picture of the food
        private String r_name;  //r_name is name of recipe
        private String r_description; //r_description is recipe description
        private long time;

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getFood_picture() {
        return food_picture;
        }

        public void setFood_picture(String food_picture) {
        this.food_picture = food_picture;
        }

        public String getR_name() {
            return r_name;
        }

        public void setR_name(String r_name) {
            this.r_name = r_name;
        }

        public String getR_description() {
            return r_description;
        }

        public void setR_description(String r_description) {
            this.r_description = r_description;
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }
}
