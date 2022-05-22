package interfaces;
//Provides a template for what methods should be found in the implementing class
public interface Contract extends ExtendedContract{

  public void term1();

  public void term2();

  @Override
  public void extendedTerm();
}
