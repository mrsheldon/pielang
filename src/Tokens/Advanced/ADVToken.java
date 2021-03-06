package Tokens.Advanced;

import Tokens.BaseToken;
import Tokens.Basic.Token;

import java.util.LinkedList;

public abstract class ADVToken <T extends BaseToken> extends Token<LinkedList<T>> {

    protected String command = "";

    public ADVToken(String type) {
        super(type, new LinkedList<>(), 0);
    }

    //Had to return LinkedList<T> for the times you use ADVToken without specifying T
    public LinkedList<T> GetData(){
        return data;
    }

    public void Append(T t){
        if(data.size() == 0)
            this.line = t.GetLine();
        this.data.add(t);
    }

    //Basically does the same thing as GetText, but only ADVTokens have this function
    public abstract String Translate() throws Exception;

    public String GetName(){ return command; }

}
