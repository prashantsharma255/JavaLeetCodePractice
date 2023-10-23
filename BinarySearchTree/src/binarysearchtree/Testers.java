
package binarysearchtree;


public class Testers {
    
    public static void checkIsEmpty(Tree t) throws Exception{
    //if the Tree is an instance of EmptyBST--> t.isEmpty()--> true
    //if the Tree is an instance of NonEmptyBST--> t.isEmpty()--> false
        if (t instanceof EmptyBST){
            if ( !t.isEmpty()){
                throw new Exception("All is not good, the tree is an EmptyBST and it's Non-Empty");
            }
        }    
        else if(t instanceof NonEmptyBST){
            if ( t.isEmpty()){
                    throw new Exception("All is not good, the tree is an NonEmptyBST and it is Empty");
            }
        }
    }
    
    public static void checkAddMemberCardinality(Tree t, int x) throws Exception{
        int nT = (t.add(x)).cardinality();
        //1. Either something was added --> Cardi increased by one
        if(nT == (t.cardinality() + 1)){
            if(t.member(x)){
                throw new Exception ("Cardi increased by 1, but the thing that was added was already a member");
            }
        }
        //2. OR the thing that was added was already there and therefor not really added.
        else if(nT == t.cardinality()){
            if(!t.member(x)){
                throw new Exception ("Cardi increased by 1, but we added a thing");
            }
        }
        else{
            throw new Exception("Something is wrong with out program");
        }   
    }  
}
