public class tree{
    private node root;

    public tree(){
        root = null;
    } 

    public node getRoot(){
        return root;
    }
    
    public void insert(int item){
        node newNode = new node();
        newNode.data = item;
        newNode.left = null;    
        newNode.right = null;


        if(root == null){
            root = newNode;
        } else {
            node current = root;
            node pastNode;
          while(true){
            pastNode = current;
            if(item<=current.data){
                current = current.left;
                if(current==null){
                pastNode.left = newNode;
                return;
            }
            }else{
                current = current.right;
                if(current==null){
                pastNode.right = newNode;
                return;
            }

          }
        }

        
}
       
}
                    public void printTree(node root){
                        if(root!=null){
                            printTree(root.left);
                            System.out.println(root.data);
                            printTree(root.right);
                        } 
                    }  

                public boolean search(int key){
                    node current = root;

                            while(key!=current.data){
                                if(key<current.data){
                                    current = current.left;
                            }else{
                                current = current.right;
                            }
                            if(current==null){
                                return false;
                            }
                            
             }
                            return true;
                }
}