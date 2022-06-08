//🐸
// node
class Node {
    constructor(val) {
        this.value = val;
        this.next = null;
    }
}
// instatiate node
var x = new Node(123);
// SLL

class SLL{
    constructor() {
        this.head = null;
    }

    isEmpty(){}

    addToFront(aNode) {
        aNode.next = this.head;
        this.head = aNode;
    }

    read() {
        var runner = this.head;
        while(runner) {
            console.log(runner.value);
            runner = runner.next;
        }

    }
}

var amazingLinkedList = new SLL();









