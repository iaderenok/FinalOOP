package Core.MVP;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


//import Core.MVP.View;

public class Presenter{

    public static void main(String[] args){
        
        List<String> exp_List = new ArrayList<>();
        List<Integer> num_List = new ArrayList<>();
        File file = new File("data.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String expression;
            int num1;
            int num2;
            int num;
            while ((expression = br.readLine()) != null) {
                String[] exp = expression.split("");
                for (int i = 0; i < exp.length; i++) {
                    exp_List.add(exp[i]);
                }
                System.out.println(expression + "=");
                exp_List.removeAll(Collections.singleton(" "));
                if (exp_List.get(1).equals("+")){
                    num1 = Integer.parseInt(exp_List.get(0));
                    num2 = Integer.parseInt(exp_List.get(2));
                    num = num1+num2;
                    num_List.add(num);
                    num1 = 0;
                    num2=0;
                    num=0;
                }
                if (exp_List.get(1).equals("-")){
                    num1 = Integer.parseInt(exp_List.get(0));
                    num2 = Integer.parseInt(exp_List.get(2));
                    num = num1-num2;
                    num_List.add(num);
                    num1 = 0;
                    num2=0;
                    num=0;
                }
                if (exp_List.get(1).equals("*")){
                    num1 = Integer.parseInt(exp_List.get(0));
                    num2 = Integer.parseInt(exp_List.get(2));
                    num = num1*num2;
                    num_List.add(num);
                    num1 = 0;
                    num2=0;
                    num=0;
                }
                if (exp_List.get(1).equals("/")){
                    num1 = Integer.parseInt(exp_List.get(0));
                    num2 = Integer.parseInt(exp_List.get(2));
                    num = num1/num2;
                    num_List.add(num);
                    num1 = 0;
                    num2=0;
                    num=0;
                }
                int count=0;
                for (int i = 3; i < exp_List.size(); i++) {
                    if (exp_List.get(i).equals("+")){
                        num1 = num_List.get(count);
                        num2 = Integer.parseInt(exp_List.get(i+1));
                        num = num1+num2;
                        num_List.add(num);
                        num1 = 0;
                        num2=0;
                        count=count+1;
                    }
                    if (exp_List.get(i).equals("-")){
                        num1 = num_List.get(count);
                        num2 = Integer.parseInt(exp_List.get(i+1));
                        num = num1-num2;
                        num_List.add(num);
                        num1 = num;
                        num2=0;
                        count=count+1;
                    }
                    if (exp_List.get(i).equals("*")){
                        num1 = num_List.get(count);
                        num2 = Integer.parseInt(exp_List.get(i+1));
                        num = num1*num2;
                        num_List.add(num);
                        num1 = num;
                        num2=0;
                        count=count+1;
                    }
                    if (exp_List.get(i).equals("/")){
                        num1 = num_List.get(count);
                        num2 = Integer.parseInt(exp_List.get(i+1));
                        num = num1/num2;
                        num_List.add(num);
                        num1 = num;
                        num2=0;
                        count=count+1;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < num_List.size(); i++) {
            if (i==num_List.size()-1){
                System.out.println(num_List.get(i));
            }
        }
       
    }
}