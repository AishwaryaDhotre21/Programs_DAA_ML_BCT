pragma solidity 0.4.25;
contract Aishwarya
{
    //declare a variable 
    uint x;
    //mapping address to balance
    mapping(address => uint)Balance;
    constructor()public{

        x=10;
    }
    function set_x(uint a)public returns(bool)
    {
        x=a;
        return true;
    }
    function() public payable
    {
        Balance[msg.sender]+=msg.value;
    }
}

contract sender{
    function transfer() public payable{
        address _receiver=0x617F2E2fD72FD9D5503197092aC168c91465E7f2;
        _receiver.transfer(80);

    }
}