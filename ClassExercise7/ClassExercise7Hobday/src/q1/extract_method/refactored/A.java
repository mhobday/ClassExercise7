package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	   findStringInList(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      findStringInList(edgeList, p);
      // other implementation
      return null;
   }

   private <A> void findStringInList(List<A> generics, String p) 
   {
	   for(A generic : generics)
	   {
		   if(generic instanceof Node)
		   {
			   if(((Node) generic).contains(p))
			   {
					System.out.println(generic);
			   }   
		   }
		   if(generic instanceof Edge)
		   {
			   if(((Edge) generic).contains(p))
			   {
					System.out.println(generic);
			   }   
		   }
	   }
	}
}


class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}