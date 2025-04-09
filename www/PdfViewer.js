var exec = require('cordova/exec');

exports.openPDF = function (filePath, success, error) {
    exec(success, error, 'PdfViewer', 'openPDF', [filePath]);
};
