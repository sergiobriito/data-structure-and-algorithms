class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> set = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");

        for (String str : tokens) {
            if (!set.contains(str)) {
                stack.push(Integer.parseInt(str));
            } else {
                int result = 0;
                int popped_1 = stack.pop();
                int popped_2 = stack.pop();
                if (str.equals("+")) {
                    result = popped_2 + popped_1;
                } else if (str.equals("-")) {
                    result = popped_2 - popped_1;
                } else if (str.equals("*")) {
                    result = popped_2 * popped_1;
                } else if (str.equals("/")) {
                    result = popped_2 / popped_1;
                }
                stack.push(result);
            };
        };

        return stack.peek();
        
    }
}