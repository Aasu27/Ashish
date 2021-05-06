import java.util.*;
public class MaxMinChar {     
    public static void main(String[] args) {    
        int i, j, min, max;   
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the String:");
    	String s = sc.next();
    	int[] ar = new int[s.length()];     
        char minChar = s.charAt(0), maxChar = s.charAt(0);
        char string[] = s.toCharArray();    
        for(i = 0; i < string.length; i++) {    
        	ar[i] = 1;    
        	for(j = i+1; j < string.length; j++) {    
        		if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {    
        			ar[i]++;   
        			string[j] = '0';    
        		}    
        	}    
        }  
        min = max = ar[0];    
        for(i = 0; i <ar.length; i++) {   
        	if(min > ar[i] && ar[i] != '0') {    
             	min = ar[i];    
             	minChar = string[i];    
        	}  
        	if(max < ar[i]) {    
        		max = ar[i];    
        		maxChar = string[i];    
        	}    
        }       
        System.out.println("Maximum : " + maxChar);   
        System.out.println("Minimum : " + minChar);    
    }
}