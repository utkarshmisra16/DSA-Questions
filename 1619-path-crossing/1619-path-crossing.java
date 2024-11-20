class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int x=0;
        int y=0;
        set.add(x + "_" + y);
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i) == 'E')
                x++;
            if(path.charAt(i) == 'W')
                x--;
            if(path.charAt(i) == 'N')
                y++;
            if(path.charAt(i) == 'S')
                y--;
            String key = x + "_" + y;
            if(set.contains(key))
                return true;
            set.add(key);
        }
        return false;
    }
}