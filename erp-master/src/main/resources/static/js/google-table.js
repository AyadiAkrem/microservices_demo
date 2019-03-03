google.charts.load('current', {'packages':['table']});
google.charts.setOnLoadCallback(drawTable);

  function drawTable() {
    fetch('/employees/allasArray')
    .then(resp => resp.json())
    .then(function(data) {
        display(data)
        });

  }

  function display(value){
      var data = new google.visualization.DataTable();
      data.addColumn('number', 'UUID');
      data.addColumn('string', 'Name');
      data.addColumn('string', 'Last Name');
      data.addColumn('string', 'Email');
      data.addColumn('string', 'Company Car');

      console.log(value);
      data.addRows(value);
      var table = new google.visualization.Table(document.getElementById('table_div'));
      table.draw(data, {showRowNumber: true, width: '50%', height: '50%'});

  }

