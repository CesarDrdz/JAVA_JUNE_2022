class Node {
    constructor(val) {
        this.value = val;
        this.next - null;
    }
}

var x = new Node(33);
// console.log(x);

class SLL {
    constructor() {
        this.head = null;
    }

    addtofront(node) {
        if (this.head === null) {
            this.head = node
        } else {
            node.next = this.head;
            this.head = node;
            // var temp = this.head;
            // this.head = node;
            // node.next = temp;
        }
    }


}

var coolList = new SLL();
var n2 = new Node(123);
coolList.addtofront(n2)
coolList.addtofront(new Node(99))
console.log(coolList);



