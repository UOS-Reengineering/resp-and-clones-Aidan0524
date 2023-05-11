package example.project.CodeClones;

import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity {

    public static double computeJaccardSimilarity(Set<String> set1, Set<String> set2) {
        // TODO: implement this function to compute the Jaccard similarity between two string arrays
         //return -1.0;

        //Intersection
        Set <String> intersectionSet = new HashSet<>();
        for (String s: set1){
            if(set2.contains(s)){
                intersectionSet.add(s);
            }
        }

        //Union
        Set<String> unionSet = new HashSet<>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);

        return (double) intersectionSet.size()/unionSet.size();
    }

}
