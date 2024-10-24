class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for(int i = sandwiches.length-1; i >= 0; i--){
            stack.push(sandwiches[i]);
        }
        for(int i = 0; i < students.length; i++){
            queue.add(students[i]);
        }

        while(!queue.isEmpty()){
            int size = queue.size();
            int preSize = size;
            while(size > 0){
                int stu = queue.poll();
                if(stack.peek() == stu){
                    stack.pop();
                    count++;
                }else{
                    queue.add(stu);
                }
                size--;
            }
            if(queue.size() == preSize) break;
        }
        return students.length - count;
    }
}