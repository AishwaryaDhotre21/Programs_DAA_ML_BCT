//SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.5.0 < 0.9.0;
contract Array_Demo{

    uint[] public stud_array;

    function insertElement(uint value) public
    {
        stud_array.push(value);
    }
    function showElement(uint index) public view returns(uint)
    {
        uint value=stud_array[index];
        return value;
    }
    function length() public view returns(uint)
    {
        return stud_array.length;
    }
    function deleteElement() public
    {
        stud_array.pop();
    }

}