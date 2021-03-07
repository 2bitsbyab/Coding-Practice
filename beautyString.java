//leetcode
class Solution {
    private int giveBeauty(String s){
        Map<Character, Integer> alpha = new <Character, Integer> HashMap();
        alpha.put('a',0);
        alpha.put('b',0);
        alpha.put('c',0);
        alpha.put('d',0);
        alpha.put('e',0);
        alpha.put('f',0);
        alpha.put('g',0);
        alpha.put('h',0);
        alpha.put('i',0);
        alpha.put('j',0);
        alpha.put('k',0);
        alpha.put('l',0);
        alpha.put('m',0);
        alpha.put('n',0);
        alpha.put('o',0);
        alpha.put('p',0);
        alpha.put('q',0);
        alpha.put('r',0);
        alpha.put('s',0);
        alpha.put('t',0);
        alpha.put('u',0);
        alpha.put('v',0);
        alpha.put('w',0);
        alpha.put('x',0);
        alpha.put('y',0);
        alpha.put('z',0);
        for(int i=0; i< s.length(); i++){
            alpha.replace(s.charAt(i), alpha.get(s.charAt(i)) + 1);
        }
        int max = Collections.max(alpha.values());
        int min = max;
        
        List<Integer> val = new ArrayList<Integer>(alpha.values());
        for (int i = 0 ; i< val.size(); i++){
            if(val.get(i)>0 && val.get(i) < min){
                min = val.get(i);
            }
        }
        
        // System.out.println(min+ " "+ max);
        return max - min;
    }
    public int beautySum(String s) {
        int res = 0;
        for(int len = 3; len<s.length(); len++){
            for( int i = 0 ; i<=s.length() - len; i++){
                // System.out.println(s.substring(i, i+len));
                res += giveBeauty(s.substring(i, i+len));
            }
        }
        return res+giveBeauty(s);
    }
}
// not an optimal solution
