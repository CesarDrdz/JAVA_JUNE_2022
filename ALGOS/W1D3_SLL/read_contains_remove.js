class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

//🐸

class SLL {
    constructor() {
        this.head = null;
    }
    // return true or false if this.head is null
    isEmpty() {
        return this.head == null;
    }

    // add given node to the head, if it exists. return void
    addToFront(unicorn) {
        if (this.head === null) {
            this.head = unicorn;
        } else{ 
            unicorn.next = this.head;
            this.head = unicorn;

        }
        // node.next = this.head; // set the new node's next to the head
        // this.head = node; // move the head to the new node
        // return this; // return back the instance so we can chain methods
    }

    // when a pointer is to the LEFT of an equal sign, we are CHANGING it
    // when a pointer is to the RIGHT of an equal sign, we are READING it

    // create a new node with given data, add it to the head. return void
    addDataToFront(data) { // 10
        var newNode = new Node(data); // create a new node with the data
        newNode.next = this.head; // set the new node's next to the head
        this.head = newNode; // move the head to the new node
        return this; // return back the instance so we can chain methods
    }

    // ---------------------------------
    // console log (print) the value of every node in the current list
    // traversal
    
    // mycoolList.read()

    read() {
        // 1 create a temp var to traverse 
        var rabbit = this.head
        // console.log(rabbit);
        while(rabbit) {
            console.log(rabbit.data);
            rabbit = rabbit.next
            // move rabbit
        }
     }

   // find: return true / false if current list contains a data equal to value
   contains(value) {
    var runner = this.head;
    while (runner) {
        if (runner.data === value) {
            return true
        }
        runner = runner.next;
    }
    return false;
}

// Remove from front: remove and return the first node in the SLL
removeFromFront() {
    var runner = this.head; //create a variable with runner and capture the head node
    this.head = runner.next; //point the head to the second node in the linked list
    runner.next = null; //point the first node's next to null so that we can return this first node
    return runner; //return the first node which doesn't point to anything.
}
}

// ⚠ 1. don't forget to instantiate the Singly Linked List
var myCoolList = new SLL();
myCoolList.addDataToFront(33);
myCoolList.addDataToFront(11);
myCoolList.addDataToFront(100);
// console.log(myCoolList);
myCoolList.read();
// // ⚠ 2. add a few nodes
// myCoolList.addDataToFront(44).addDataToFront(33).addDataToFront(22).addDataToFront(11);
// // this.head -> 11 -> 22 -> 33 -> 44
// // ⚠ 2. write test cases
// myCoolList.read();
// myCoolList.contains(33); // true
// myCoolList.contains(7777); // false
// myCoolList.removeFromFront(); // this.head -> 22 -> 33 -> 44


// var myList = {
//     value: 11,
//     next: {
//         value: 22,
//         next: {
//             value: 33,
//             next: {
//                 value: 1337,
//                 next: {
//                     value: 9001,
//                     next: null
//                 }
//             }
//         }
//     }
// }
// console.log(myList.next.next.next.next);


// var runner = this.head;