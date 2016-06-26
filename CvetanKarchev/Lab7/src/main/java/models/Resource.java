package models;

import contracts.IResource;

public class Resource
    implements IResource {
  private int quantity;

  public Resource(int quantity) {
    this.setQuantity(quantity);
  }

  @Override
  public int getQuantity() {
    return this.quantity;
  }

  @Override
  public void add(IResource resource) {

  }

  private void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
