package com.callor.iolist;

import com.callor.iolist.service.impl.IoListServiceImplV1;

public class IoListEx_01 {

    public static void main(String[] args) {

	IoListServiceImplV1 ioService = new IoListServiceImplV1();

	ioService.loadDataFromFile();
	ioService.ioListSum();
	ioService.printIoList();

    }
}
