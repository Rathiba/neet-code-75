package algorithm;

import java.util.LinkedList;

public class Example {
        public int minimumLength(String s) {
            LinkedList<Integer> em=new LinkedList<>();
            int start=0; int end=s.length()-1;
            if(start==end){
                return 1;
            }
            if(start<end){
                {
                while(start<end &&s.charAt(start)==s.charAt(start+1)){
                    start++;
                }
                while(start<end && s.charAt(end)==s.charAt(end-1)){
                    end--;
                }
                if(start>=end){
                    return 0;
                }
                }
                start++;
                end--;
            }
            else
            {
                return start-end-1;
            }
            return 1;
        }

    }
