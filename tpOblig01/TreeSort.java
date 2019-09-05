
public class TreeSort {
	class Node {
		char key;
		Node left, right;

		public Node(char item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	TreeSort() {
		root = null;
	}

	void insert(char key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, char key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key) {
			root.left = insertRec(root.left, key);
		} else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}
	}

	void treeins(char arr[]) {
		for (int i = 0; i < arr.length; i++) {
			insert(arr[i]);
		}
	}

}
