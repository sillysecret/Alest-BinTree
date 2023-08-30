public class tree{
    private node root;

    public tree(){
        root = null;
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
}