// IBookAidlInterface.aidl
package com.plkj.studysample.aidl;
import com.plkj.studysample.aidl.Book;
// Declare any non-default types here with import statements

interface IBookAidlInterface {
    List<Book> getBookList();
    void addBookInOut(inout Book book);
}
