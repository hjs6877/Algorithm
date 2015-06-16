package kr.ac.korea.datastructure.tree.bst;

public class BinarySearchTree {
	private Node root = null;
	
	/**
	 * 1. root 노드가 null이라면 root 노드를 추가.
	 * 2. root 노드부터 탐색 시작.
	 *  - 비교대상인 left, right 노드가 null이 아닌동안 루프 돌면서 비교.
	 *  - 비교대상인 left, right 노드가 null이라면 해당 노드 추가 후, 루프 종료.
	 *  - 비교대상 노드의 key와 같다면, 루프 종료.
	 * @param num
	 */
	public Node add(int num){
		if(root == null){
			root = new Node(num);
		}else{
			Node node = root;
			while(true){
				if(num < node.key){
					if(node.left != null){
						node = node.left;
					}else{
						node.left = new Node(num);
						return root;
					}
				}else if(num > node.key){
					if(node.right != null){
						node = node.right;
					}else{
						node.right = new Node(num);
						return root;
					}
				}else{
					return root;
				}
			}
		}
		
		return root;
	}
	
	public void delete(int num){
		
	}
	
	public int search(int num){
		Node node = root;
		while(node != null){
			if(num == node.key){
				return node.key;
			}else if(num < node.key){
				node = node.left;
			}else{
				node = node.right;
			}
		}
		return 0;
	}
	
	private boolean checkAddNode(Node node, int num){
		if(num < node.key){
			if(node.left != null){
				node = node.left;
			}else{
				node.left = new Node(num);
				return false;
			}
		}else if(num > node.key){
			if(node.right != null){
				node = node.right;
			}else{
				node.right = new Node(num);
				return false;
			}
		}else{
			return false;
		}
		return true;
	}
}
