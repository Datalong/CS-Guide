package Project02.src.service;

import Project02.src.bean.Customer;
/**
 * @Auther: Datalong
 * @Date: 2021/3/25 - 03 -25 -14:16
 * @Dscription: 给Customer对象的管理模块使用，内部用数组管理一组Customer对象，并提供相应的添加，修改，删除和遍历方法供CustomerView使用
 * @version: 1.0
 */
public class CustomerList {
    private Customer[] customers;//保存客户对象的数组
    private int total = 0;//记录已保存客户对象的数量

    public CustomerList(int totalCustomer){//初始化数组 数组多长
        customers = new Customer[totalCustomer];
    }

    public boolean addCustoner(Customer customer){//指定用户添加到数组 成功true
        if(total >= customers.length){
            return false;
        }
        customers[total] = customer;
        total++;
        //customers[total++] = customer;
        return true;
    }

    public boolean replaceCustomer(int index, Customer cust){//修改指定索引位置的客户信息
        if(index < 0 || index >= total){
            return false;
        }
        customers[index] = cust;//有意义就做修改
        return true;
    }

    public boolean deleteCustomer(int index){//删除指定索引位置上的客户 return true成功；
        if(index < 0 || index >= total){
            return false;
        }
        for (int i = index; i < total-1;  i++) {//为啥total减1 因为i < total，下标就是total-1,customers[i+1]=tatal+1,所以在这里total-1,出来才是total
            customers[i] = customers[i+1];
        }

        //最后有数据的元素需要制null
//        customers[total - 1] = null;
//        total--;
        customers[--total] = null;//先减1 total-1给null

        return true;
    }

    public Customer[] getAllCustomers(){//获取所有客户信息
        Customer[] custs = new Customer[total];    //不能直接return Customer 因为这是空的
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    public Customer getCustomer(int index){//获取指定索引位置上的客户
        if(index < 0 || index >= total){
            return null;
        }
        //如果找到了元素，则放回，如果没找到返回null
        return customers[index];
    }

    public int getTotal(){//就相当于total的get方法  获取客户存储的数量
       return total;//不要写customer.length(这个比那个大）
    }

}
