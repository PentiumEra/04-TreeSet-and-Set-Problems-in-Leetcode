import java.util.TreeSet;

/**
 * @Auther: linghaoDo
 * @Date:Created at 2019/1/3
 * @Description: 求有多少不同的摩斯码
 */
public class Solution {
    public int uniqueMorseRepresentations(String[] words){
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        TreeSet<String>set=new TreeSet<>();
        for(String word:words){
            StringBuilder result=new StringBuilder();
            for(int i=0;i<word.length();i++){
                /*获取每个字母对应的摩斯码*/
                result.append(codes[word.charAt(i)-'a']);
                set.add(result.toString());
            }

        }
        /*因为在集合中，如果元素相同会被自动过滤掉，所以不会担心相同的摩斯码出现*/
        return set.size();
    }

}
