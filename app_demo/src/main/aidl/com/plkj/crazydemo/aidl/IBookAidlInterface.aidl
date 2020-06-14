// IBookAidlInterface.aidl
package com.plkj.crazydemo.aidl;
import com.plkj.crazydemo.aidl.Book;
// Declare any non-default types here with import statements

interface IBookAidlInterface {
    List<Book> getBookList();
    void addBookInOut(inout Book book);
}
