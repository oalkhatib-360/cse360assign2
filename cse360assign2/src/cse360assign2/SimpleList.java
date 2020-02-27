/**
 * @author: Omar Alkhatib
 * Class ID: 214
 * Assignment #: 1
 * 
 * Description: This class creates a simple list of size 10 and contains methods that allows the user to add integers to the list, remove integers from the list,
 * count the number of elements in the list, convert the list to a string format, and search the list.
 * 
 */

package cse360assign2;

import java.util.Arrays;

public class SimpleList {
	private int[] list;
	private int count;
	
	/**
	 * This method is used to create an array of size 10 and set the counter to 0
	 */
	public SimpleList() {
		
		list = new int[10];
		count = 0;

	}
	
	/**
	 * This method is used to add an element, num, to the list.
	 * @param num This is the number parameter taken that will be added to the array.
	 */
	public void add(int num) {
		if (count == 10) {
			double newSize = 10*1.5;
			list = new int[(int) newSize];
		}
		int[] tempArr = new int[count];
		for (int index = 0; index < count; index++) {
			tempArr[index] = list[index];
		}
		getList()[0] = num;
		for (int index = 0; index < count - 1; index++) {
			getList()[index + 1] = tempArr[index];
		}
		count++;
	}
	/**
	 * This method is used to remove an element, num, from the list.
	 * @param num This is the number parameter taken that will be removed from the array.
	 */
	public void remove(int num) {
		for (int index = 0; index < count; index++) {
			if (getList()[index] == num) {
				getList()[index] = 0;
				for (int j = 0; j < (count - index); j++) {
					getList()[index] = getList()[index + 1];
				}
				count--;
			}
		}

	}
	/**
	 * This method is used to count the number of elements in the list.
	 * @return count This is the count of elements in the array
	 */
	public int count() {
		for (int index = 0; index < 10; index++) {
			if (getList()[index] != 0) {
				count++;
			}
		}
		return count;
	}
	/**
	 * This method is used to convert the list into string format, replacing the , with " "
	 * @return listToStr This is the string that contains the array.
	 */
	public String toString() {
		String listToStr = Arrays.toString(getList());
		listToStr = listToStr.replaceAll(", ", " ").replace("[", "").replace("]", "");
		return listToStr;

	}
	/**
	 * This method is used to add an element, num, to the list.
	 * @param srch This is the element that will be searched for in the array
	 * @return found This is the index that the element was found at. -1 is returned if element is not found.
	 */
	public int search(int srch) {
		int found = -1;
		for (int index = 0; index < count; index++) {
			if (srch == getList()[index]) {
				found = index;
			}
		}
		return found;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int[] getList() {
		return list;
	}

	public void setList(int[] list) {
		this.list = list;
	}

}
