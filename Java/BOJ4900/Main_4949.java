package Baekjoon.Java.BOJ4900;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/*public class Main_4949 {*/
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        boolean check = false;

        while (true) {
            String s = input.nextLine();
            if (s.equals("."))  {
                break;
            }

            while (!stack.isEmpty()) {
                stack.pop();
            }

            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                    check = true;
                }

                else if (s.charAt(i) == ')') {
                    if (stack.isEmpty()) {
                        check = false;
                        System.out.println("No");
                        break;
                    }
                    if (stack.peek() == '(') {
                        stack.pop();
                        check = true;
                        continue;
                    }
                    check = false;
                    break;
                }
                else if (s.charAt(i) == ']') {
                    if (stack.isEmpty()) {
                        check = false;
                        System.out.println("No");
                        break;
                    }
                    if (stack.peek() == '[') {
                        stack.pop();
                        check = true;
                        continue;
                    }
                    check = false;
                    break;
                }
            }

            if (!stack.isEmpty()) {
                System.out.println("No");
                continue;
            }

            if (check) {
                System.out.println("Yes");
            }


        }

    }*/
    public class Main_4949 {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int t = 0;
            while(t == 0) {
                String line = br.readLine();
                if(line.equals(".")) break;
                boolean chk = true;
                Stack<Character> stack = new Stack<Character>();
                for(int i = 0; i < line.length(); i++){
                    char c = line.charAt(i);
                    if(c == '(' || c == '['){
                        stack.add(c);
                    } else if(c == ')'){
                        if(!stack.empty() && stack.pop() == '(') continue;
                        else {
                            chk = false;
                            break;
                        }
                    } else if(c == ']') {
                        if(!stack.empty() && stack.pop() == '[') continue;
                        else {
                            chk = false;
                            break;
                        }
                    }
                }
                if(chk && stack.isEmpty()) bw.write("yes\n");
                else bw.write("no\n");
            }

            bw.flush();
            br.close();
            bw.close();
        }
    }

