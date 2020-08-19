/**
 * Definition for a binary tree node.
 */

fun sumEvenGrandparent(root: TreeNode?): Int {

}

var sum = 0

fun DFS(root: TreeNode, grandfather:TreeNode,  level:Int) {
    if(level > 1 && grandfather.value % 2 == 0) sum+= root.value
}


class TreeNode {
    var value = 0
    var left: TreeNode? = null
    var right: TreeNode? = null

    constructor() {}
    constructor(value: Int) {
        this.value = value
    }

    constructor(value: Int, left: TreeNode?, right: TreeNode?) {
        this.value = value
        this.left = left
        this.right = right
    }
}
