function chessBoardCellColor(cell1, cell2) {
  if(cell1.charCodeAt(0) % 2 + cell2.charCodeAt(0) % 2 == cell1.charCodeAt(1) % 2 + cell2.charCodeAt(1) % 2) {
      return true;
  }else if (cell1 == cell2) {
      return true;
  }

  return false;
}