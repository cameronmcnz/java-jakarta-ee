let http = require('http');
let fs = require('fs');
let formidable = require('formidable');

http.createServer(function (req, res) {
	let form = new formidable.IncomingForm();
	form.parse(req, function(error, fields, file) {
		let filepath = file.fileupload.filepath;
		let newpath = 'C:/upload-example/';
		newpath += file.fileupload.originalFilename;
		fs.rename(filepath, newpath, function() {
			res.write('NodeJS File Upload Success!');
			res.end();
		});
	});

}).listen(80);