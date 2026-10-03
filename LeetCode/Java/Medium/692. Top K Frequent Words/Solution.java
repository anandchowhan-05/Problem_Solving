class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> {
        if (b.getValue() != a.getValue()) {
        return b.getValue() - a.getValue();
        }
        return a.getKey().compareTo(b.getKey());
        });
        
        List<String> lst=new ArrayList<>();
            for (Map.Entry<String, Integer> entry : list) {
                if(k>=1){
                    lst.add(entry.getKey());
                }
                k--;
            }

        return lst;
    }
}