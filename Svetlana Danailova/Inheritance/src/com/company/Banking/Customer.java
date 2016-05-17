package com.company.Banking;

 enum Customer {;

     private CustomerType customerType;

     public CustomerType getCustomerType() {
         return customerType;
     }

     Customer(CustomerType customerType) {
         this.customerType = customerType;
     }
 }
