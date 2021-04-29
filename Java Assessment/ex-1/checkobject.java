public class CheckObject {
int id=101;
int newid;
CheckObject()
{
newid=newid;
id=id;
}
public int hashcode(){
return newid;
}
public static void main(String[] args){
CheckObject c =new CheckObject();
System.out.println(c);
System.out.println(c.toString);
}}