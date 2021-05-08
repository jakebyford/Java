public class ItemNode {
   private String item;
   private ItemNode nextNodeRef; // Reference to the next node                                        

   public ItemNode() {
      item = "";
      nextNodeRef = null;
   }

   // Constructor                                                                                     
   public ItemNode(String itemInit) {
      this.item = itemInit;
      this.nextNodeRef = null;
   }

   // Constructor                                                                                     
   public ItemNode(String itemInit, ItemNode nextLoc) {
      this.item = itemInit;
      this.nextNodeRef = nextLoc;
   }

   // Insert node after this node.                                                                   
   public void insertAfter(ItemNode nodeLoc) {
      ItemNode tmpNext;

      tmpNext = this.nextNodeRef;
      this.nextNodeRef = nodeLoc;
      nodeLoc.nextNodeRef = tmpNext;
   }

   // TODO: Define insertAtEnd() method that inserts a node
   //       to the end of the linked list  
   public void insertAtEnd(ItemNode headNode, ItemNode currNode) {
      
      ItemNode tmpNode;                         // tmpNode is actually "private nextNodeRef"
      
      tmpNode = headNode;                       // tmpNode = 86    "nextNodeRef = memoryLocation 86"
      while(tmpNode.nextNodeRef != null) {      // tmpNode.nextNodeRef or "86" != null
         tmpNode = tmpNode.nextNodeRef;         // tmpNode = 86
      }
      tmpNode.nextNodeRef = currNode;           // tmpNode.nextNodeRef = 84
      
   }

   // Get location pointed by nextNodeRef                                                             
   public ItemNode getNext() {
      return this.nextNodeRef;
   }
   
   public void printNodeData() {
      System.out.println(this.item);
   }
}
