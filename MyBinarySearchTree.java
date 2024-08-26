public class MyBinarySearchTree {

    MyBinarySearchTree left, right;
    int value;

    public MyBinarySearchTree(int value){
        this.value = value;
    }

    public void insert(int value){
        if(value <= this.value){
            if(left == null){
                left = new MyBinarySearchTree(value);
            }else{
                left.insert(value);
            }
        }else{
            if(right == null){
                right = new MyBinarySearchTree(value);
            }else{
                right.insert(value);
            }
        }
    }

    public boolean contains(int value){

        if(value == this.value){
            return true;
        }else if(value < this.value){
            if(left == null){
                return false;
            }else{
                return left.contains(value);
            }
        }else{
            if(right == null){
                return false;
            }else{
                return right.contains(value);
            }
        }
    }

    public void printInOrder(){
        if(left != null){
            left.printInOrder();
        }
        System.out.println(value);
        if(right != null){
            right.printInOrder();
        }
    }

    public static void main(String[] args){
        MyBinarySearchTree myTree = new MyBinarySearchTree(10);

        myTree.insert(2);
        myTree.insert(6);
        myTree.insert(3);
        myTree.insert(1);


        for(int i = 0; i<=10; i++){
            System.out.println("Does the tree contain " + i + ": " + myTree.contains(i));
        }

        System.out.println("The conents of the tree inorder are: ");
        myTree.printInOrder();

    }
}

