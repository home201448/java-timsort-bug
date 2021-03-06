/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.lang.ref;

public class ReferenceQueue extends java.lang.Object
{
   static java.lang.ref.ReferenceQueue NULL;
   static java.lang.ref.ReferenceQueue ENQUEUED;


   /*@ requires true; ensures true; assignable \everything; */
   public ReferenceQueue();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.ref.Reference poll();

   /*@ requires true; ensures true; assignable \everything; signals (java.lang.IllegalArgumentException e) true; signals (java.lang.InterruptedException e) true; */
   public java.lang.ref.Reference remove(long arg0) throws java.lang.IllegalArgumentException, java.lang.InterruptedException;

   /*@ requires true; ensures true; assignable \everything; signals (java.lang.InterruptedException e) true; */
   public java.lang.ref.Reference remove() throws java.lang.InterruptedException;
}
