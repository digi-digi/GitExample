//package com.company;
//
//public class Dicer2 {
//
//    private int dicesNo;
//
//    public Dicer2(int dicesNo){
//        this.dicesNo = dicesNo;
//    }
//
//    public void throwDices() {
//        Random random = new Random();
//
//        StringBuilder stringBuilder = new StringBuilder("{");
//
//        for (int i = 0; i<dicesNo; i++){
//            stringBuilder.append(random.nextInt(6)+1).append(",");
//        }
//        stringBuilder.delete(stringBuilder.lastIndexOf(","), stringBuilder.length());
//
//        stringBuilder.append("}");
//
//        System.out.println(stringBuilder.toString());
//    }
//    public static void main (String[] args){
//        new Dicer2 (1).throwDices();;
//        new Dicer2 (2).throwDices();;
//        new Dicer2 (3).throwDices();;
//    }
//}
