class Solution {
    public String destCity(List<List<String>> paths) {
       Set<String> mp = new HashSet<>(); 
       for(List<String> path : paths){
            String source = path.get(0);
            mp.add(source);
        }

        for(List<String> path : paths){
            String dest = path.get(1);
            if(!mp.contains(dest)){
                return dest;
            }
        }
        return "";
    }
}