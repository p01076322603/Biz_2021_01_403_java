package com.callor.score.service;

import com.callor.score.model.ScoreVO;

public interface ScoreService {
    
    public void saveScoreToList();
    public void makeScoreToFile();
    public void printScoreList();
    public ScoreVO makeScoreAvgTotal(ScoreVO score);

}
