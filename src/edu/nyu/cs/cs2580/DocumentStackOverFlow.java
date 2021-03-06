package edu.nyu.cs.cs2580;

/**
 * document for stackoverflow, mainly add vote for the document(question)
 * @author Ray
 *
 */
public class DocumentStackOverFlow extends Document{
  
  private static final long serialVersionUID = -6473419056494802194L;
  private int _length = 0;
  private int _vote = 0;

  public DocumentStackOverFlow(int docid) {
    super(docid);
  }
  
  public void setLength(int length) {
    this._length = length;
  }
  
  public int getLength(){
    return this._length;
  }
  
  public int getVote(){
    return this._vote;
  }
  
  public void setVote(int vote) {
    this._vote = vote;
  }
}
