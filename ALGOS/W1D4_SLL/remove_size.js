class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class SLL {
    constructor() {
        this.head = null;
    }

    // console log (print) the data of every node in the current list
    // coolSll.read()
    read() {
        // console.log(this.head.next.data);
        // create a temp var to run through
        var turtle = this.head;
        while(turtle != null) {
            console.log(turtle.data);
            // move turtle
            turtle = turtle.next;

        }
    }

    // find: return true / false if current list contains a data equal to value
    contains(value) {
        // start at the head
        var runner = this.head;
        // while we have a runner
        while (runner) {
            // return true if data === value
            if (runner.data === value) {
                return true;
            }
            // otherwise advance the runner
            runner = runner.next;
        }
        // if the while loop completes, return false
        return false;
    }

    // Remove from front: remove and return the first node in the SLL
    removeFromFront() {
        // temp var to store the node to delete
        var temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        return temp;

    }

    // return true or false if this.head is null
    isEmpty() {
        return this.head == null;
    }

    // add given node to the head, if it exists. return void
    // coolSll.addToFront(new Node(123))
    addToFront(node) {
        // var temp = this.head;
        node.next = this.head;
        this.head = node;
    }

    // myList.addToFront(new Node(22));

    // when a pointer is to the LEFT of an equal sign, we are CHANGING it
    // when a pointer is to the RIGHT of an equal sign, we are READING it

    // create a new node with given data, add it to the head. return void
    addDataToFront(data) { // 10
        var newNode = new Node(data); // create a new node with the data
        newNode.next = this.head; // set the new node's next to the head
        this.head = newNode; // move the head to the new node
    }

    // if data is contained within the current list, delete it.
    // return void
    // assume there are no duplicates
    // consider the edge case if you have to delete the head node
    // consider the edge case your list is empty
    // consider the edge case that your list does not contain the data
    delete(data) {    }

    // runner here is undefined
    // return the size of the current linked list
    // BONUS: how might you do this without linearly traversing the list? O(1)
    // you may have to change other methods within this class... 
    size() { }
}


// Don't forget to instantiate the SLL!
var coolSll = new SLL();

// var node1 = new Node(22);
// var node2 = new Node(33);
coolSll.addToFront(new Node(22));
coolSll.addToFront(new Node(33));

console.log(coolSll.removeFromFront());
// coolSll.removeFromFront()
console.log(coolSll);

// coolSll.read()
// console.log(coolSll);
// and add a few nodes first!

// (head) -> (33) -> (22) -> null
//            ^
//          runner