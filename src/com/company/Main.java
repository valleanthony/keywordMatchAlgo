package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Job job = new Job();
        job.setKeywords("Java,Python,SQL,Excel,postgress,git");



       ArrayList<String> main = new ArrayList<String>();
        main.add("Java"); //**
        main.add("job");
        main.add("anthony");
        main.add("valle");
        main.add("excel");//**
        main.add("git");//**
        main.add("client");
        main.add("millions");
        main.add("analytics");
        main.add("python");//**
        main.add("clients");
        main.add("i");
        main.add("need");
        main.add("a");
        main.add("job");
        main.add("office");
        main.add("postgress");//**


        User user = new User();
        user.setResult(main);



        //this is another method
//        ****public List<String> SplitKeyWords (String key){ //updated to split up words
        System.out.println("start of method");
        String key = job.getKeywords();
        System.out.println("printing the string coming in from the user class" + key);
        List<String> items = Arrays.asList(key.split("\\s*,\\s*"));
        System.out.println("printing the split up list" + items);

        //This is a tet of the method
       // public boolean compareTool (User user, Job job){

        ArrayList<String> userResume = user.getResult();
            List<String> jobKeywords = items;
            int counter = 0;
            int keyWordCount = jobKeywords.size();
            for (String word : jobKeywords) {
                System.out.println("These are keywords in the job description: " +word);
                for (String notkey : userResume) {
                    System.out.println( "This is from the user Resume: "+notkey);
                    if (word.equalsIgnoreCase(notkey)) {
                        counter++;
                    }
                }
            }
        System.out.println(keyWordCount);
        System.out.println(counter);
            double mainscore = (keyWordCount*.8);
        System.out.println(mainscore);

            if ( counter > mainscore) {
//                return true;
                System.out.println(true);
            } else {
//                return false;
                System.out.println(false);
            }


    }

//    public List<String> SplitKeyWords (String key){ //updated to split up words
//
//        List<String> items = Arrays.asList(key.split("\\s*,\\s*"));
////            return items;
//    }



//        String keywords;
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Enter keywords");
//        keywords =keyboard.nextLine();
//        List<String> item1= new List<String>();
//        if (keywords.contains(",")){
//            List<String> items = Arrays.asList(keywords.split("\\s*,\\s*"));
//            System.out.println(items);
//            System.out.println(items.get(1));
//        }
//
//


/*
 In the home controller for the page that allows users to apply for a job, the method should be called;
 the user applying for the job should be passed in the method as well as the job that the user is applying to. The method
 will return a boolean value (if true is returned user meets qualifications if false is returned user does not meet
 qualifications). The boolean should trigger a label on the webpage to display whether a user has been selected for an
 interview.
 */


//        public boolean compareTool (User user, Job job){
//            ArrayList<String> userResume = user.getResult();
//            List<String> jobKeywords = SplitKeyWords(job.getKeyWord());
//            int counter = 0;
//            int keyWordCount = jobKeywords.size();
//            for (String word : jobKeywords) {
//                for (String key : userResume) {
//                    if (word == key) {
//                        counter++;
//                    }
//                }
//            }
//            double score = ((double) counter / (double) keyWordCount) * 100;
//
//            if (score > 80.00) {
////                return true;
//                System.out.println(true);
//            } else {
////                return false;
//                System.out.println(false);
//            }
//
//        }
    }




