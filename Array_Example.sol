//SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.5.0 < 0.9.0;

contract Array_Demo
{
    //Fixed array
    uint[4] public Student_array_roll=[10,20,30,40];

    function setter(uint index,uint value)public
    {
        Student_array_roll[index]=value;
    }

    function getter(uint index) view public returns(uint)
    {
        uint value=Student_array_roll[index];
        return value;
    }

    function length() public view returns(uint)
    {
        return Student_array_roll.length;
    }
}